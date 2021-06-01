public class worker {
    private String fullName;
    private String post;
    private String mail;
    private int phoneNumber;
    private int salary;
    private int age;

    public void workerInfo(){
        System.out.println("ФИО: " + getFullName());
        System.out.println("Должность: " + getPost());
        System.out.println("Электронный адресс: " + getMail());
        System.out.println("Номер телефона: " + getPhoneNumber());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Возраст: " + getAge());
        System.out.println();
    }

    public worker (){
    }

    public worker(String fullName, String post, String mail, int phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

