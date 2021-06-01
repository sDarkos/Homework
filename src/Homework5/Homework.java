public class Homework {
    public static void main(String[] args) {

        worker[] workerArray = new worker[5];
        workerArray[0] = new worker("Максим Добрынин", "программист", "maks@mail.ru", 23054, 3000000, 33);
        workerArray[1] = new worker("Сергей Нигматуллин", "прораб", "sergey@gmail.com", 21013, 96000, 26);
        workerArray[2] = new worker("Ксения султанова", "тестировщик", "Kseniya@mail.ru", 24431, 70000, 27);
        workerArray[3] = new worker("Виталий Гливинский", "директор", "VG@compulink.ru",  23311, 180000, 45);
        workerArray[4] = new worker("Светлана Бутузова", "менеджер", "Sveta@rambler.ru", 21044, 45000,42);

        infWorkAge(40,workerArray);

    }

    public static void infWorkAge(int age, worker[] workerArray){
        for (int i = 0; i < workerArray.length ; i++) {
            if (age <= workerArray[i].getAge()){
                workerArray[i].workerInfo();
            }
        }
    }

}
