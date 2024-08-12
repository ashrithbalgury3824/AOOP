package lab2b;

public class UserSession {
    private static UserSession instance;
    private String name;
    private int id;
    private String source;
    private String destination;
    private String shareRide;

    private UserSession() {}

    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getShareRide() {
        return shareRide;
    }

    public void setShareRide(String shareRide) {
        this.shareRide = shareRide;
    }
}