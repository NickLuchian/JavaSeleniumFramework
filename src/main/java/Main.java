import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.demoqa.com/");
        driver.quit();

        /*Scanner sc = new Scanner(System.in);
        System.out.println("ведите строку");
        String input = sc.nextLine();


        String space = "";
        String star = input;
        for (int i = 0; i < 10; i++) {
            space +=star;
            System.out.println(space);
        }*/


        /*List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            list.add(rand);
        }
        System.out.println(list);

        //using Stream instead of for loop
        //Stream <Integer> streamUse = Stream.generate(()-> new Random().nextInt(10)).limit(10);
        List<Integer> filteredList = Stream.generate(() -> new Random().nextInt(20)).limit(10).filter(e -> e > 5).collect(Collectors.toList());
        System.out.println(filteredList);*/

    }
}
