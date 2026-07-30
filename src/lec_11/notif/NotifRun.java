package lec_11.notif;

public class NotifRun {
    static void main() {
        Notification not = new Push();
        not.send();

        Push notPush = new Push();
        notPush.print();
        notPush.send();
    }
}
