public class GenClass {

    public static void main(String[] args) {

        class Stack<T> {
            void push(T value) {
                // T temp = value.clone();
            }

            T pop() {

            }
        }

        class Box<T> {
            // T stands for "Type"
            private T t;

            public void set(T t) {
                this.t = t;
            }

            public T get() {
                return t;
            }
        }

        class Gen<T> {
            T ob; // объявление объекта типа T

            // Передать конструктору ссылку на объект типа T
            Gen(T o) {
                ob = o;
            }

            // Вернуть ob
            T getob() {
                return ob;
            }

            // Показать тип T
            void showType() {
                System.out.println("Тип T: " + ob.getClass().getName());
            }
        }

        class TwoGen<T, V> {
            T ob1;
            V ob2;

            // Передать конструктору ссылки на объекты двух типов
            TwoGen(T o1, V o2) {
                ob1 = o1;
                ob2 = o2;
            }

            void showTypes() {
                System.out.println("Тип T: " + ob1.getClass().getName());
                System.out.println("Тип V: " + ob2.getClass().getName());
            }

            T getob1() {
                return ob1;
            }

            V getob2() {
                return ob2;
            }
        }

        Stack<Integer> st = new Stack<Integer>();
        Stack stX = new Stack();
        Stack stX1 = new Stack<Integer>();

        //stX1.push(2);
        //stX1.push("2");


        System.out.println(st.getClass().getName());

        Gen<Integer> iOb = new Gen<Integer>(77);
        iOb.showType();
        System.out.println("value=" + iOb.getob());

        Gen<String> strOb = new Gen<String>("text sample");

        strOb.showType();
        System.out.println("value=" + strOb.getob());

        TwoGen<Integer, String> twogenObj = new TwoGen<Integer, String>(775, "Обобщённый текст");
        twogenObj.showTypes();

        // Узнаем значения
        int value = twogenObj.getob1();
        System.out.println("Значение: " + value);

        String str = twogenObj.getob2();
        System.out.println("Значение: " + str);

        // Box<Integer> integerBox = new Box<Integer>();

    }

}