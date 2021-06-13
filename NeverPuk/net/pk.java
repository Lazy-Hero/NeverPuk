package net;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.mf;
import net.xn;
import net.z9;
import net.c9.b;
import net.z.m;
import net.z.th;
import net.z.tu;

public class pk extends tu {
   private final tu l;
   private final String a;
   private final String y;
   private final List K = Lists.newArrayList();
   protected String B;
   private int u;

   public pk(tu var1, String var2, String var3) {
      this.l = var1;
      this.a = var2;
      this.y = var3;
      this.B = b.x("gui.done", new Object[0]);
   }

   public void L() {
      this.m.add(new th(0, q / 2 - 74, V / 6 + 96, this.B));
      this.K.clear();
      this.K.addAll(this.O.m(this.y, q - 50));
   }

   protected void t(m var1) throws IOException {
      z9.G().s(this.l);
   }

   public void v(int var1, int var2, float var3) {
      mf.O();
      this.C();
      this.d(this.O, this.a, q / 2, 70, 16777215);
      byte var5 = 90;
      Iterator var6 = this.K.iterator();
      if(var6.hasNext()) {
         Object var7 = var6.next();
         this.d(this.O, (String)var7, q / 2, var5, 16777215);
         int var10000 = var5 + this.O.R;
      }

      super.v(var1, var2, var3);
   }

   public void o(int var1) {
      this.u = var1;

      for(m var3 : this.m) {
         var3.O = false;
      }

   }

   public void K() {
      mf.O();
      super.K();
      if(--this.u == 0) {
         Iterator var2 = this.m.iterator();
         if(var2.hasNext()) {
            m var3 = (m)var2.next();
            var3.O = true;
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
