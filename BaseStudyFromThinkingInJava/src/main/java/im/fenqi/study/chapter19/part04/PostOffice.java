package im.fenqi.study.chapter19.part04;
/*
* 19.10.1、处理邮件（Mail类）的方法
* */
public class PostOffice {
    enum MailHandler{
        GENERAL_DELIVERY{
            boolean handle(Mail m){
                switch (m.generalDelivery)
                {
                    case YES:
                            print("Using general delivery for "+m);
                            return true;
                    default:
                            return false;
                }
            }
        },
        MACHINE_SCAN{
            @Override
            boolean handle(Mail m) {
                switch (m.scannability)
                {
                    case UNSCANNABLE:return false;
                    default:
                            switch (m.address){
                                case INCORRECT:return false;
                                default:
                                    print("Delivering "+m+" automatically");
                                    return true;
                            }
                }
            }
        };
        abstract boolean handle(Mail m);
    }
    public static <T> void print(T str)
    {
        System.out.println(str);
    }
    static void handle(Mail m)
    {
        for (MailHandler handler:MailHandler.values())
        {
            handler.handle(m);
        }
    }

    public static void main(String[] args) {
        for (Mail m:Mail.generator(10))
        {
            print(m.details());
            handle(m);
            print("******************");
        }
    }
}
