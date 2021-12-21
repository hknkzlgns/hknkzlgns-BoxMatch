public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==== Yeni Round ====");
                if (isStart() == false) {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                }
                else {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                }


                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }

    }

    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;

        }
        return false;
    }

    boolean isStart() {
        double start = Math.random() * 100;
        return start <= 50;
    }

}
