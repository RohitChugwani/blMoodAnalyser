import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void givenMsg_whenHappyMessage_shouldReturnHappy() {
        String mood = MoodAnalyser.moodAnalyse("I am tired");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMsg_whenSadMessage_shouldReturnSad() {
        String mood = MoodAnalyser.moodAnalyse("I am sad");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMsg_InConstructor_whenSad_ShouldReturnSad() {
        MoodAnalyser moodInConstructor = new MoodAnalyser("I am sad");
        String mood = moodInConstructor.moodAnalyse();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMsg_InConstructor_whenHappy_shouldReturnHappy() {
        MoodAnalyser moodInConstructor = new MoodAnalyser("I am happy");
        String mood = moodInConstructor.moodAnalyse();
        Assert.assertEquals("HAPPY",mood);

    }

    @Test
    public void givenMsg_InConstructor_whenNull_shouldReturnHappy() {
        MoodAnalyser moodInConstructor = new MoodAnalyser();
        String mood = moodInConstructor.moodAnalyse();
        Assert.assertEquals("HAPPY",mood);
    }
}
