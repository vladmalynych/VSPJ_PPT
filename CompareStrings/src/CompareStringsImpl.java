public class CompareStringsImpl implements CompareStrings {

    private String str1;
    private String str2;

    CompareStringsImpl(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public int compare()
    {
        int l1 = this.str1.length();
        int l2 = this.str2.length();
        int lmin = Math.min(l1, l2);

        // Check one by one
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)this.str1.charAt(i);
            int str2_ch = (int)this.str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        // Substring
        if (l1 != l2) {
            return l1 - l2;
        }

        // Equals
        else {
            return 0;
        }
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "First:" + this.str1 + " Second:" + this.str2;
    }

    public String getBiggerStr(){
        int res = compare();
        if (res < 0){
            return this.str2;
        }else if (res > 0){
            return this.str1;
        }
        return null;
    }

    public String getSmallerStr(){
        int res = compare();
        if (res < 0){
            return this.str1;
        }else if (res > 0){
            return this.str2;
        }
        return null;
    }

    public Boolean checkEqualStr(){
        int res = compare();
        if (res == 0){
            return true;
        }
        return false;
    }

}
