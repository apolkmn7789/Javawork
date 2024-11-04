package Day12;

import java.util.Random;
import java.util.Scanner;

// 포켓몬 클래스: 포켓몬의 이름, 색깔, 크기 속성을 정의
class Pokemon {
    private String name;
    private String color;
    private String size;

    public Pokemon(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getInfo() {
        return color + " " + name + "이고 크기는 " + size + "입니다.";
    }
}

// 몬스터볼 클래스: 포켓몬을 담는 역할
class MonsterBall {
    private Pokemon pokemon;

    public MonsterBall(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}

// 오박사 클래스: 몬스터볼을 생성하고 포켓몬을 담음
class ProfessorOak {
    private String[] names = {"피카츄", "파이리", "꼬부기", "이상해씨"};
    private String[] colors = {"노란색", "빨간색", "파란색", "초록색"};
    private String[] sizes = {"대", "중", "소", "미니"};

    private Random random = new Random();

    public MonsterBall createMonsterBall() {
        String name = names[random.nextInt(names.length)];
        String color = colors[random.nextInt(colors.length)];
        String size = sizes[random.nextInt(sizes.length)];

        Pokemon pokemon = new Pokemon(name, color, size);
        return new MonsterBall(pokemon);
    }
}

// 지우 클래스: 몬스터볼을 선택하고 포켓몬 정보를 확인
class Ash {
    private MonsterBall[] monsterBalls;

    public Ash(MonsterBall[] monsterBalls) {
        this.monsterBalls = monsterBalls;
    }

    public void chooseMonsterBall(int choice) {
        if (choice < 1 || choice > monsterBalls.length) {
            System.out.println("잘못된 번호입니다. 1부터 " + monsterBalls.length + " 사이의 번호를 선택하세요.");
            return;
        }
        MonsterBall selectedBall = monsterBalls[choice - 1];
        System.out.println("선택한 포켓몬: " + selectedBall.getPokemon().getInfo());
    }
}

// 메인 클래스
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProfessorOak professorOak = new ProfessorOak();

        // 오박사가 3개의 몬스터볼을 생성
        MonsterBall[] monsterBalls = new MonsterBall[3];
        for (int i = 0; i < 3; i++) {
            monsterBalls[i] = professorOak.createMonsterBall();
        }

        // 지우가 몬스터볼 중 하나를 선택
        Ash ash = new Ash(monsterBalls);
        System.out.println("지우가 포켓몬 볼을 선택합니다.");
        System.out.print("1, 2, 3 중 하나의 번호를 선택하세요: ");
        int choice = sc.nextInt();

        ash.chooseMonsterBall(choice);
        sc.close();
    }
}
