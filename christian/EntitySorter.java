package sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class EntitySorter {
   private EntitySorter() {
      // No instances allowed
   }

   public static List<String> sortStrings(final List<String> string) {
      Collections.sort(strings, new Comparator<String>() {
         @Override
         public int compare(final String string1, final String string2) {
            return string1.compareToIgnoreCase(string2);
         }
      });
      return strings;
   }
}
