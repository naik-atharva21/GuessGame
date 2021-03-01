class GuessGame
{
    private String[] words = 
    {
        "Computer",
        "Earth",
        "Science",
        "Goat"
    }

    String wrd;

    private void choose()
    {
        //Choose a random word
        int index;

        do
        {
            index = (int)(math.random() * 10);
        } while (index > words.length - 1);

        wrd = words[index];
    }

    public static void main(String[] args)
    {
        GuessGame gg = new GuessGame();
        gg.choose();
    }
}