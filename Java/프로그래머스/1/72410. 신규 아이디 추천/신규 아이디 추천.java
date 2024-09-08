class Solution {
    public String solution(String new_id) {
        UserId id = new UserId(new_id).doFilter();
                        
        return id.id;
    }
    
    class UserId {
        
        String id;
        
        UserId(String id) {
            this.id = id;
        }
          
        UserId step01() {
            id = id.toLowerCase();
            return this; 
        }
        
        UserId step02() {
            id = id.replaceAll("[^a-z0-9._-]", "");
            return this;
        }
        
        UserId step03() {
            id = id.replaceAll("[.]{2,}", ".");
            return this;
        }
        
        UserId step04() {
            while (id.length() > 0 && id.charAt(0) == '.') {
                id = id.substring(1);
            }

            while (id.length() > 0 && id.charAt(id.length() - 1) == '.') {
                id = id.substring(0, id.length() - 1);
            }

            return this;
        }
        
        UserId step05() {
            if(id.length() == 0) {
                id = "a";
            }
            
            return this;
        }
        
        UserId step06() {
            if(id.length() >= 16) {
                id = id.substring(0, 15);
            }
            
            return this.step04();
        }
        
        UserId step07() {
            while(id.length() <= 2) {
                id = id + id.charAt(id.length() - 1);
            }
            
            return this;
        }
        
        UserId doFilter() {
            return this.step01()
                    .step02()
                    .step03()
                    .step04()
                    .step05()
                    .step06()
                    .step07();
        }
    }
}
