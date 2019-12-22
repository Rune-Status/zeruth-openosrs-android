package net.oprs;

public class Paramaters {

    public static String s1 = "1";
    public static String s2 = "https://payments.jagex.com/operator/v1/";
    public static String s3 = "true";
    public static String s4 = "36273";
    public static String s5 = "1";
    public static String s6 = "0";
    public static String s7 = "0";
    public static String s8 = "true";
    public static String s9 = "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw";
    public static String s10 = "5";
    public static String s11= "https://auth.jagex.com/";
    public static String s12 = "494";
    public static String s13 = ".runescape.com";
    public static String s14 = "0";
    public static String s15 = "0";
    public static String s16 = "false";
    public static String s17 = "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM";
    public static String s18 = "";
    public static String s19 = "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com";

    public static String getParameter(String paramater)
    {
        switch (paramater)
        {
            case "1":
                return s1;
            case "2":
                return s2;
            case "3":
                return s3;
            case "4":
                return s4;
            case "5":
                return s5;
            case "6":
                return s6;
            case "7":
                return s7;
            case "8":
                return s8;
            case "9":
                return s9;
            case "10":
                return s10;
            case "11":
                return s11;
            case "12":
                return s12;
            case "13":
                return s13;
            case "14":
                return s14;
            case "15":
                return s15;
            case "16":
                return s16;
            case "17":
                return s17;
            case "18":
                return s18;
            case "19":
                return s19;
                default:
                    return "";
        }

    }

    public static String getHost()
    {
        return "http://oldschool9.runescape.com";
    }
}
