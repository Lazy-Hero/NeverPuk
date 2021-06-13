package net;

import java.util.Comparator;
import net.mf;
import net.ur;
import net.xn;
import net.z9;

public class _u implements Comparator {
   public int compare(Object var1, Object var2) {
      mf.O();
      ur var4 = (ur)var1;
      ur var5 = (ur)var2;
      return var4.t != var5.t?var5.t - var4.t:(!z9.Z(var4.H, var5.H)?var4.H.compareTo(var5.H):var4.X.compareTo(var5.X));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
