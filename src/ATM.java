
    public class ATM {
        public static void main(String[] args) {
            ATM sbiAtm=new ATM();
            sbiAtm.withdrawCash(300);
        }
        public int withdrawCash(int amt) {
            int highest=0;
            int tray[]= {20,100,200,2000,500};
            for(int i=0;i<tray.length;i++) {
                //highest=tray[i];
                if(i<tray.length-1) {
                    if(highest<tray[i+1]) {
                        highest=tray[i+1];
                        System.out.println(highest);
                    }
                }
                else {
                    if(highest<tray[i]) {
                        highest=tray[i];
                    }
                }
            }
            System.out.println("The highest value is...:"+highest);
            return highest;
        }
    }


