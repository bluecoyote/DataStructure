public class IsNumber {
    public boolean isNumber(String s) {
        //要判断的条件较多啊
        if(s.isEmpty() || s == null) return false;
        String ss = s.trim().toLowerCase();
        if(ss.isEmpty() || ss.equals("e") || ss.equals(".")) return false;
        char[] sss = ss.toCharArray();
        int i = 0;
        if(sss[0] == '-' || sss[0] == '+')  i = 1;
        if(sss[0] == 'e') return false;
        int ecount = 0;
        int elocation = 0;
        int dotcount = 0;
        int dotlocation = 0;
        int numcount = 0;
        for(; i < sss.length; i++){
            if(sss[i] == 'e'){
                ecount++;
                elocation = i;
                if(i==0) return false;
                if(i == 1){
                    if(sss[0]=='+' || sss[0]=='-') return false;
                }
                if(i+1 < sss.length){
                    if(sss[i+1] >= '0' && sss[i+1] <= '9') continue;
                    if(sss[i+1] == '+' || sss[i+1] == '-') {
                        i++;
                        if(i == sss.length-1) return false;
                        continue;
                    }
                    else return false;
                }
                if(i+1 == sss.length) return false;
                continue;
            }
            if(sss[i] == '.'){
                dotcount++;
                dotlocation = i;
                if(i==0 && i+1 < sss.length){
                    if(sss[i+1] == 'e') return false;
                };
                if(i+1 < sss.length){
                    if(sss[i+1] >= '0' && sss[i+1] <= '9') continue;
                    else{
                        if(sss[i+1] == 'e') continue;
                        else return false;
                    } 
                }
                continue;
            }
            if(sss[i] >='0' && sss[i] <= '9'){
                numcount++;
                continue;
            } 
            else return false;
        }
        if(ecount > 1) return false;
        if(dotcount >1) return false;
        if(numcount == 0) return false;
        if(elocation > 0 && dotlocation >0 && elocation < dotlocation) return false;
        return true;
    }
}