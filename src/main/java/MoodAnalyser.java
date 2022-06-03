public class MoodAnalyser {

    String message;

    public MoodAnalyser(String msg)
    {
        this.message = msg;
    }
    public MoodAnalyser()
    {

    }

    public static String moodAnalyse( String msg) {
        msg = msg.toUpperCase();
        if (msg.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
    public void setMessage( String message)
    {
        this.message = message;
    }
    public  String moodAnalyse () {
        try {
            if (message.toUpperCase().contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            return "HAPPY";
        }
    }

}
