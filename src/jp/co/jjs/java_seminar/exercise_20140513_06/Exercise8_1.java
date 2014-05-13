package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_1 {
    public static void main(String[] args) {
        String x = "月";
        
        switch (x) {
        case "月":
            System.out.println("今日は月曜日です。一週間で一番だるいです。");
            break;
        case "火":
            System.out.println("今日は火曜日です。月曜よりはましですがだるいです。");
            break;
        case "水":
            System.out.println("今日は水曜日です。週の半分ということで若干気が楽です。");
            break;
        case "木":
            System.out.println("今日は木曜日です。今日頑張れば明日で最後・・・！");
            break;
        case "金":
            System.out.println("今日は金曜日です。最高です。");
            break;
        case "土":
            System.out.println("今日は土曜日です。今日も明日も休みということで言うことなしです。");
            break;
        case "日":
            System.out.println("今日は日曜日です。最高ですが夕方からテンションがた落ちです。");
            break;

        default:
            break;
        }
    }
}
