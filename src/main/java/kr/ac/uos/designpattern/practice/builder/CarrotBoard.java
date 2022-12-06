package kr.ac.uos.designpattern.practice.builder;

import lombok.ToString;

@ToString(of = {"title", "content", "author", "carrotPay", "pictureName"})
public class CarrotBoard {
    private String title;
    private String content;
    private String author;
    private boolean carrotPay;
    private String pictureName;

    private CarrotBoard(String title, String content, String author, boolean carrotPay, String pictureName) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.carrotPay = carrotPay;
        this.pictureName = pictureName;
    }

    public static CarrotBoardBuilder builder() {
        return new CarrotBoardBuilder();
    }

    public static class CarrotBoardBuilder {

        private String title;
        private String content;
        private String author;
        private int price;
        private boolean carrotPay = false;
        private String pictureName;

        private CarrotBoardBuilder() {
        }

        public CarrotBoardBuilder title(String title) {
            this.title = title;
            return this;
        }

        public CarrotBoardBuilder content(String content) {
            this.content = content;
            return this;
        }

        public CarrotBoardBuilder price(int price) {
            this.price = price;
            return this;
        }

        public CarrotBoardBuilder author(String author) {
            this.author = author;
            return this;
        }

        public CarrotBoardBuilder carrotPay(boolean carrotPay) {
            this.carrotPay = carrotPay;
            return this;
        }

        public CarrotBoardBuilder pictureName(String pictureName) {
            this.pictureName = pictureName;
            return this;
        }

        public CarrotBoard build() {
            return new CarrotBoard(this.title, this.content, this.author, this.carrotPay, this.pictureName);
        }
    }
}

