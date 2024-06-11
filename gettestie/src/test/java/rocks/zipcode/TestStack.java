package rocks.zipcode;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestStack {


    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Word");
        stack.pop();
        assertEquals(true, stack.isEmpty());

    }

    @Test

    public void TestArrayList() {
        List<Integer> arr = new ArrayList<>();
        arr.add(7);
        assertEquals(true, arr.contains(7));
    }

    @Test

    public void TestArrayList2() {
        List<String> arr = new ArrayList<>();
        arr.add("word");
        int word = arr.indexOf("word");
        assertEquals(0, word);
    }

    @Test

    public void TestHashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 2);
        assertEquals(true, map.containsKey("Apple"));
    }

    @Test

    public void TestHashMap1() {
        HashMap<String, Objects> map = new HashMap<>();
        assertEquals(true, map.isEmpty());
    }


    @Test
    public void TestLinkedList() {
        List<String> ls = new LinkedList<>();
        ls.isEmpty();
        assertEquals(true, ls.isEmpty());

    }

    @Test
    public void TestLinkedList1() {
        List<Integer> ls = new LinkedList<>();
        ls.add(0);
        assertEquals(true, ls.contains(0));
    }

    @Test
    public void TestArrayDeque() {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.poll();
        assertEquals(true, ad.isEmpty());

    }

    @Test
    public void TestArrayDeque1() {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.size();
        assertEquals(true, ad.isEmpty());

    }


    @Test

    public void TestHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Bob");
        set.isEmpty();
        assertEquals(false, set.equals(0));


    }

    @Test
    public void TestHashSet1() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.spliterator();
        assertEquals(true, set.contains("Apple"));
    }

    @Test
    public void TestVector() {
        Vector<Integer> one = new Vector<>();
        one.add(76);
        one.indexOf(76);
        assertEquals(false, one.contains(0));

    }

    @Test
    public void TestVector1() {
        Vector<Integer> one = new Vector<>();
        one.add(23);
        assertEquals(false, one.equals(2));
    }

    @Test
    public void TestTreeMap() {
        TreeMap map = new TreeMap<>();
        map.put(2, "lea");
        assertEquals(true, map.containsKey(2));

    }

    @Test
    public void TestTreeMap1() {
        TreeMap map = new TreeMap<>();
        map.size();
        assertEquals(true, map.isEmpty());


    }

    @Test

    public void TestTreeSet() {
        TreeSet<String> set = new TreeSet();
        set.add("Flower");
        assertEquals(true, set.contains("Flower"));

    }


    @Test
    public void TestTreeSet1() {
        TreeSet<String> set = new TreeSet();
        set.add("Pen");
        set.clear();
        assertEquals(true, set.isEmpty());


    }


    @Test
    public void TestIterator() {
        Iterator<String> set = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };


    }

    @Test
    public void TestPriorityQueue() {
        PriorityQueue<String> set = new PriorityQueue<>();
        set.add("Number");
        assertEquals(true, set.contains("Number"));


    }


    @Test
    public void TestPriorityQueue1() {
        PriorityQueue<String> set = new PriorityQueue<>();
        set.add("Bottle");
        set.clear();
        assertEquals(true, set.isEmpty());


    }

    @Test
    public void TestComparable(){
        Comparable<String> set = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };









    }








}
