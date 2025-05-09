import deque.ArrayDeque61B;

import jh61b.utils.Reflection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Deque;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class ArrayDeque61BTest {

     @Test
     @DisplayName("ArrayDeque61B has no fields besides backing array and primitives")
     void noNonTrivialFields() {
         List<Field> badFields = Reflection.getFields(ArrayDeque61B.class)
                 .filter(f -> !(f.getType().isPrimitive() || f.getType().equals(Object[].class) || f.isSynthetic()))
                 .toList();

         assertWithMessage("Found fields that are not array or primitives").that(badFields).isEmpty();
     }

    @Test
    @DisplayName("Add first test")
    void addFirstTest() {
        ArrayDeque61B<Object> lld1 = new ArrayDeque61B<>();
        lld1.addFirst(0);
        lld1.addFirst(7);
        lld1.addFirst(6);
    }

    @Test
    @DisplayName("Add first test")
    void addLastTest() {
        ArrayDeque61B<Object> lld1 = new ArrayDeque61B<>();
        lld1.addLast(1);
        lld1.addLast(2);
        lld1.addLast(3);
    }

    @Test
    @DisplayName("Add first test")
    void addFirstandLastTest() {
        ArrayDeque61B<Object> lld1 = new ArrayDeque61B<>();
        lld1.addLast(0);
        lld1.addLast(1);
        lld1.addLast(2);
        lld1.addFirst(7);
        lld1.addFirst(6);
        lld1.addLast(3);
        lld1.addFirst(5);
        lld1.addLast(4);
    }

    @Test
    public void getTest() {
        ArrayDeque61B<Integer> lld1 = new ArrayDeque61B<>();
        assertThat(lld1.get(0)).isEqualTo(null);
        lld1.addLast(10);
        assertThat(lld1.get(1)).isEqualTo(10);
        lld1.addFirst(2);
        assertThat(lld1.get(0)).isEqualTo(2);
        assertThat(lld1.get(-1)).isEqualTo(null);
        assertThat(lld1.get(121234)).isEqualTo(null);
    }

    @Test
    public void isEmptyTest() {
        ArrayDeque61B<Integer> lld1 = new ArrayDeque61B<>();
       assertThat(lld1.isEmpty()).isTrue();
       lld1.addLast(1);
        assertThat(lld1.isEmpty()).isFalse();
    }

    @Test
    public void sizeTest() {
        ArrayDeque61B<Integer> lld1 = new ArrayDeque61B<>();
        assertThat(lld1.size()).isEqualTo(0);
        lld1.addLast(1);
        assertThat(lld1.size()).isEqualTo(1);
        lld1.addFirst(2);
        assertThat(lld1.size()).isEqualTo(2);
    }

    @Test
    public void listTest() {
        ArrayDeque61B<Integer> lld1 = new ArrayDeque61B<>();
        lld1.addFirst(1);
        lld1.addFirst(7);
        lld1.addLast(2);
        assertThat(lld1.toList()).containsExactly(7,1,2).inOrder();
        lld1.addLast(3);
        assertThat(lld1.toList()).containsExactly(7,1,2,3).inOrder();
    }



    @Test
    public void removeFirstTest() {
        ArrayDeque61B<Integer> lld1 = new ArrayDeque61B<>();
       // assertThat(lld1.toList()).containsExactly(null,null,null, null, null, null, null, null).inOrder();
        lld1.addFirst(1);
        assertThat(lld1.removeFirst()).isEqualTo(1);
        lld1.addFirst(2);
        assertThat(lld1.removeFirst()).isEqualTo(2);
    }

    @Test
    public void removeLastTest() {
        ArrayDeque61B<Integer> lld1 = new ArrayDeque61B<>();
        //assertThat(lld1.toList()).containsExactly(null,null,null, null, null, null, null, null).inOrder();
        lld1.addLast(1);
        assertThat(lld1.removeLast()).isEqualTo(1);
        lld1.addLast(2);
        assertThat(lld1.removeLast()).isEqualTo(2);
     }
}
