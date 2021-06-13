package net;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class g7 extends Properties {
   private final Set B = new LinkedHashSet();

   public synchronized Object put(Object var1, Object var2) {
      this.B.add(var1);
      return super.put(var1, var2);
   }

   public Set keySet() {
      Set var1 = super.keySet();
      this.B.retainAll(var1);
      return Collections.unmodifiableSet(this.B);
   }

   public synchronized Enumeration keys() {
      return Collections.enumeration(this.keySet());
   }
}
