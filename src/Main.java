import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] shapes = new GeometricFigure[]{
                new Circle(10.25),
                new Triangle(6.33, 8.22),
                new Square(3.69)
        };

        double totalArea = 0;
        for (GeometricFigure shape : shapes) {
            totalArea += shape.getArea();

        }

        System.out.println("Total area of all shapes: " + totalArea);

        Participant[] participants = {
                new Human("Людина", 1000, 2),
                new Cat("Кіт", 500, 3),
                new Robot("Робот", 1500, 1)
        };

        Obstacle[] obstacles = {
                new RunningTrack(800),
                new Wall(2)
        };

        for (Participant participant : participants) {
            boolean completedAll = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println("Учасник " + participant.getName() + " не зміг пройти перешкоду.");
                    completedAll = false;
                    break;
                }
            }
            if (completedAll) {
                System.out.println("Учасник " + participant.getName() + " успішно пройшов усі перешкоди.");
            }
        }
    }
}

}