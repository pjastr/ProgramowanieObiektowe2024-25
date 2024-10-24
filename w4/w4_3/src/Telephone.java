class Telephone {

    private String brand;
    private String model;


    public void call(String number, String model) {
        System.out.println("Calling number " + number + " from " + brand + " " + this.model);
    }

    public void sendMessage(String number, String content) {
        System.out.println("Sending a message to " + number + " with content: " + content);
    }

}