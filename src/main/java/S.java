import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class S extends P{
    @Override
    public Set<Character> k(char[] l) {
        Set<Character> e =new HashSet<>();

        for ( char x:l ) {
            e.add(x);
        }
        return e;
    }

    @Override
    public void k() {
        super.k();
    }
    public void k(BigDecimal t){

    }
}
