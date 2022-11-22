package BobbyHood;

public class NPC extends Person {
    private String gender;
    private boolean engaged;
    private String question;
    private int correctAnswerIndex;
    private int correctTypeIndex;
    private Item item;

    public NPC(String name, String description, String gender, String question, int i, int t, Item item) {
        super(name, description);
        this.gender = gender;
        engaged = false;
        this.question = question;
        correctAnswerIndex = i;
        correctTypeIndex = t;
        this.item = item;
    }

    public NPC() {
        String[] dialog = new String[3];
    }

    // Set dialog method
    public void setDialog(String[] dialog) {
        super.setDialog(dialog);
    }

    public Item getItem() {
        return item;
    }

    public void setItemAmount() {
        item.getAmount();
    }

    public int getValue() {
        return item.getAmount();
    }

    public String getQuestion() {
        return question + "\n\033[3mFill in the blank by typing the correct number.\033[0m";
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public int getCorrectTypeIndex() {
        return correctTypeIndex;
    }

    public String getGender() {
        return gender;
    }

    public String printGender() {
        String genderString = "";
        if (gender.equals("Male")) {
            genderString = "his";
        } else if (gender.equals("Female")) {
            genderString = "her";
        } return genderString;
    }

    public String printType(int index) {
        String typeString = "";
        if (index == 1) {
            typeString = "charm";
        } else if (index == 2) {
            typeString = "reason";
        } return typeString;
    }

    // method for setting which response the npc has to use wether they have been engaged or not
    public void setEngaged(boolean b) {
        engaged = b; //set the value of engaged
    }

    public boolean getEngaged() {
        return engaged;
    }

    public String getRejected() {
        return "Hey Bobby, we already talked"; //add a standard message to all npc's that bobby has talked to
    }

}
