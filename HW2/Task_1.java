package hw2;

public class Task_1 {

    public static void main(String[] args) {

        // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

        String request = "select * from students where ";
        String filterData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] pairs = filterData.split(",");
        int counter = pairs.length - 1;
        StringBuilder sb = new StringBuilder(request);

        for (int i = 0; i < pairs.length; i++) {
            String[] currentPair = pairs[i].split(":");
            String columnName = currentPair[0].trim().replace("\"", "").replace("{", "");
            String columnValue = currentPair[1].trim().replace("\"", "'").replace("}", "");

            if (!columnValue.equalsIgnoreCase("'null'")) {
                sb.append(columnName).append("=").append(columnValue);
                if (i < counter) {
                    sb.append(" AND ");
                }
            } else {
                counter--;
            }
            counter--;

        }
        System.out.println(sb);
    }

}
