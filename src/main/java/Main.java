import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[15];
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.remove(2);

        System.out.println("---------------------------------");

        System.out.println("Реализация Iterator:");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------------------------");

        System.out.println("Реализация for each:");
        for(Object o : collection){
            System.out.println(o);
        }

        System.out.println("---------------------------------");

        List collection1 = new ArrayList(); //interface List
        Set collection2 = new HashSet();    //interface Set
        Queue collection3 = new PriorityQueue();    //interface Queue
        Map map = new HashMap();    //interface Map

        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.set(2, 5);
//        collection1.set(6, 1);    IndexOutOfBoundsException

        System.out.println("Вывод ArrayList чере for:");
        for (int i = 0; i < collection1.size(); i++) {
            System.out.println(collection1.get(i));
        }

        System.out.println("---------------------------------");

        collection3.offer(1);
        collection3.offer(2);
        collection3.offer(3);

        System.out.println("Вывод очереди с помощью for each и peek");
        for (Object o : collection3){
            System.out.println(collection3.peek());
        }
        System.out.println("Размер очереди: " + collection3.size());

        System.out.println("---------------------------------");

        System.out.println("Вывод очереди с помощью Iterator и peek");
        Iterator iterator3 = collection3.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        System.out.println("Размер очереди: " + collection3.size());

        System.out.println("---------------------------------");

        System.out.println("Вывод очереди с помощью Iterator и poll");
        iterator3 = collection3.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        System.out.println("Размер очереди: " + collection3.size());

        collection3.offer(1);
        collection3.offer(2);
        collection3.offer(3);

        System.out.println("---------------------------------");

        System.out.println("Вывод очереди с помощью for и poll");
        for (int i = 0; i < collection3.size(); i++){
            System.out.println(collection3.poll());
        }
        System.out.println("Размер очереди: " + collection3.size());

        System.out.println("---------------------------------");

        collection2.add(1);
        collection2.add(1);
        collection2.add(2);
        collection2.add(2);
        collection2.add(2);
        collection2.add(3);
        collection2.add(3);

        System.out.println("В эту очередь были добавлены одинаковые обьекты:");
        for (Object o : collection2){
            System.out.println(o);
        }

        System.out.println("---------------------------------");

        map.put(1, "Denis");
        map.put(2, "Oleg");
        map.put(3, "Alex");
        map.put(4, "Mik");

        System.out.println("Вывод Map с помощью entrySet и for each:");
        Set set = map.entrySet();
        for (Object o : set){
            System.out.println(o);
        }

        System.out.println("---------------------------------");

        System.out.println("Вывод Map по ключам:");
        for (int i = 1; i <= map.size(); i++){
            System.out.println(map.get(i));
        }

        System.out.println("---------------------------------");

    }

}
