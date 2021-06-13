package net;

import com.sun.jna.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.xn;
import net.ne.l;

public class pj extends s {
   private static final List X = Collections.unmodifiableList(Arrays.asList(new String[]{"userId", "username", "discriminator", "avatar"}));
   public String T;
   public String F;
   public String G;
   public String p;

   public pj(String var1) {
      this.a(var1);
   }

   public pj() {
      this("UTF-8");
   }

   public boolean equals(Object var1) {
      boolean var2 = l.d();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof pj)) {
         return false;
      } else {
         pj var3 = (pj)var1;
         return Objects.equals(this.T, var3.T) && Objects.equals(this.F, var3.F) && Objects.equals(this.G, var3.G) && Objects.equals(this.p, var3.p);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.T, this.F, this.G, this.p});
   }

   protected List R() {
      return X;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
