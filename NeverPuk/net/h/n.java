package net.h;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.cb.t;
import net.h.h;
import net.h.l;
import net.h.m;
import net.yz.m_;

public class n implements h {
   private final List w = Lists.newArrayList();
   private final Random o = new Random();
   private final m_ v;
   private final t U;

   public n(m_ var1, @Nullable String var2) {
      this.v = var1;
      this.U = null;
   }

   public int p() {
      int var1 = 0;

      for(h var3 : this.w) {
         var1 += var3.p();
      }

      return var1;
   }

   public net.h.z C() {
      l.l();
      int var2 = this.p();
      if(!this.w.isEmpty() && var2 != 0) {
         int var3 = this.o.nextInt(var2);
         Iterator var4 = this.w.iterator();
         if(var4.hasNext()) {
            h var5 = (h)var4.next();
            var3 = var3 - var5.p();
            return (net.h.z)var5.c();
         } else {
            return m.R;
         }
      } else {
         return m.R;
      }
   }

   public void Z(h var1) {
      this.w.add(var1);
   }

   public m_ a() {
      return this.v;
   }

   @Nullable
   public t d() {
      return this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
