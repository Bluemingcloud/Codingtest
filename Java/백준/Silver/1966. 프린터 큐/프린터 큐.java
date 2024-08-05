import java.io.*;
import java.util.*;

public class Main {

    static class Print {
        int key;
        int priority;

        public Print(int key, int priority) {
            this.key = key;
            this.priority = priority;
        }        
    }

    public static void main(String[] args) throws IOException {         

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {

            Queue<Print> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new Print(i, priority));
                priorityQueue.offer(priority);
            }

            int printOrder = 0;
            while (!queue.isEmpty()) {
                Print current = queue.poll();

                if (current.priority == priorityQueue.peek()) {
                    priorityQueue.poll();
                    printOrder++;
                    if (current.key == m) {
                        bw.write(printOrder + "\n");
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }        
        bw.flush();
        bw.close();
        br.close();        
    }
}
