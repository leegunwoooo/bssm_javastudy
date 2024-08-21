    package studyexten;

    public class samsung extends phone {//extends를 통해 상속받음
        public String company;
        public String phoneModel;
        public int battery;

        public samsung(String company, String phoneModel, int battery) {
            this.company = company;
            this.phoneModel = phoneModel;
            this.battery = battery;
        }

        @Override
        public void showInfo() {//오버라이드 다음장에 설명
            System.out.println("전원 유무 : " + power);
            System.out.println("제작회사 : " + company);
            System.out.println("폰 기종 : " + phoneModel);
            System.out.println("배터리 잔량 : " + battery);
        }

    }
    
