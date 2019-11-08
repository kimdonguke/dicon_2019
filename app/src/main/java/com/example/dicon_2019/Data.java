package com.example.dicon_2019;

public class Data {

        private String mainText;
        private String headline;

        public String getMainText() {
            return mainText;
        }
        public String getHeadline(){
            return headline;
        }

        public void setYesoryes(String mainText) {
            this.mainText = mainText;
        }

        public Data(String mainText,String headline) {
            this.headline=headline;
            this.mainText = mainText;
        }
}
