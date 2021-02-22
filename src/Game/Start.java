package Game;

public class Start {
    public static void main (String[] args) {


        Terminator terminator = new Terminator(1000, 500, "Terminator");
        IronMan ironMan = new IronMan(2000, 300, "IronMan");
        Neo neo = new Neo(1500, 700, "Neo");
        boolean bool = true;
        int i = 0;
        do {
            i++;

            int a = 0, b = 2;
            int random = (int) (a + (Math.random() * b));
            int r = 0, t = 3;
            int rand = (int) (r + (Math.random() * t));
            switch (rand) {
                //terminator
                case 0: {
                    System.out.println("Terminator атакує");
                    Man[] man = {neo, ironMan};
                    terminator.attack(man[random]);
                    System.out.println(man[random].getName());
                    System.out.println("Залишилoся " + man[random].getHp() + " HP");
                    System.out.println("Атаку завершено\n----------");

                    if (man[random].getHp() <= 0) {
                        System.out.println(man[random].getName() + " - Вбитий гру завершено");
                        bool = false;
                    }
                    break;
                }
                //ironMan
                case 1: {
                    System.out.println("IronMan атакує" );
                    Man[] man = {neo, terminator};
                    ironMan.attack(man[random]);
                    System.out.println(man[random].getName());
                    System.out.println("Залишилoся " + man[random].getHp() + "HP");
                    System.out.println("Атаку завершено\n----------");

                    if (man[random].getHp() <= 0) {
                        System.out.println(man[random].getName() + " - Вбитий гру завершено");
                        bool = false;
                    }
                    break;
                }
                //neo
                case 2: {
                    System.out.println("Neo атакує");
                    Man[] man = {terminator, ironMan};
                    neo.attack(man[random]);
                    System.out.println(man[random].getName());
                    System.out.println("Залишилoся " + man[random].getHp() + "HP");
                    System.out.println("Атаку завершено\n----------");

                    if (man[random].getHp() <= 0) {
                        System.out.println(man[random].getName() + " - Вбитий гру завершено");
                        bool = false;
                    }
                    break;
                }
            }
        } while (bool);

    }
}
