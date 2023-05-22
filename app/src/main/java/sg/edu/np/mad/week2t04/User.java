package sg.edu.np.mad.week2t04;

public class User {
    public String name;
    public String description;

    public Integer id;
    public boolean followed;
    public User(){ }

    public User(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
    public String getName() {return name;}
    public String getDescription() {
        return description;
    }
    public Integer getId() {return id;}

    public void setFollowed(boolean followed) {
        this.followed = false;
    }
}

