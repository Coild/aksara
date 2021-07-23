package com.irwan.irwanta;

public class Response {
    private String[] prob;

    private String classnya;
    private String classBaru;

    public String[] getProb ()
    {
        return prob;
    }

    public void setProb (String[] prob)
    {
        this.prob = prob;
    }

    public String getClassnya ()
    {
        if("0".equals(classnya)){
            classBaru = "ba";
        }
        else if("1".equals(classnya)){
            classBaru = "ca";
        }
        else if("2".equals(classnya)){
            classBaru = "da";
        }
        else if("3".equals(classnya)){
            classBaru = "ga";
        }
        else if("4".equals(classnya)){
            classBaru = "ha";
        }
        else if("5".equals(classnya)){
            classBaru = "ja";
        }
        else if("6".equals(classnya)){
            classBaru = "ka";
        }
        else if("7".equals(classnya)){
            classBaru = "la";
        }
        else if("8".equals(classnya)){
            classBaru = "ma";
        }
        else if("9".equals(classnya)){
            classBaru = "na";
        }
        else if("10".equals(classnya)){
            classBaru = "nga";
        }
        else if("11".equals(classnya)){
            classBaru = "nya";
        }
        else if("12".equals(classnya)){
            classBaru = "pa";
        }
        else if("13".equals(classnya)){
            classBaru = "ra";
        }
        else if("14".equals(classnya)){
            classBaru = "sa";
        }
        else if("15".equals(classnya)){
            classBaru = "ta";
        }
        else if("16".equals(classnya)){
            classBaru = "wa";
        }
        else if("17".equals(classnya)){
            classBaru = "ya";
        }
        else{
            classBaru = "Tidak Terdeteksi";
        }
        return classBaru;
    }

    public void setClassnya (String classnya)
    {
        this.classnya = classnya;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [prob = "+prob+", classnya = "+classnya+"]";
    }
}