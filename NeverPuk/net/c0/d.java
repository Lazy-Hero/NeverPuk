package net.c0;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.xn;
import net.c0.a;
import net.c0.l;
import net.c0.q;
import net.c0.w;
import net.c0.x;
import net.nj.f;
import net.yz.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d implements l {
   private static final Logger o = LogManager.getLogger();
   private final Map c = Maps.newHashMap();
   private final Map M = Maps.newHashMap();
   private final int b;

   public d(int var1) {
      this.b = var1;
   }

   public f V(a var1, f var2) {
      int var3 = var2.K("DataVersion", 99)?var2.P("DataVersion"):-1;
      return this.w(var1, var2, var3);
   }

   public f w(a var1, f var2, int var3) {
      if(var3 < this.b) {
         var2 = this.U(var1, var2, var3);
         var2 = this.A(var1, var2, var3);
      }

      return var2;
   }

   private f U(a var1, f var2, int var3) {
      List var4 = (List)this.M.get(var1);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         x var6 = (x)var4.get(var5);
         if(var6.X() > var3) {
            var2 = var6.r(var2);
         }
      }

      return var2;
   }

   private f A(a var1, f var2, int var3) {
      List var4 = (List)this.c.get(var1);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         var2 = ((w)var4.get(var5)).X(this, var2, var3);
      }

      return var2;
   }

   public void U(q var1, w var2) {
      this.w(var1, var2);
   }

   public void w(a var1, w var2) {
      this.L(this.c, var1).add(var2);
   }

   public void y(a var1, x var2) {
      q.G();
      List var4 = this.L(this.M, var1);
      int var5 = var2.X();
      if(var5 > this.b) {
         o.warn("Ignored fix registered for version: {} as the DataVersion of the game is: {}", Integer.valueOf(var5), Integer.valueOf(this.b));
      }

      if(!var4.isEmpty() && ((x)h.s(var4)).X() > var5) {
         int var6 = 0;
         if(var6 < var4.size()) {
            if(((x)var4.get(var6)).X() > var5) {
               var4.add(var6, var2);
            }

            ++var6;
         }
      }

      var4.add(var2);
      if(net.u.d.y() == null) {
         q.R(new String[1]);
      }

   }

   private List L(Map var1, a var2) {
      List var3 = (List)var1.get(var2);
      ArrayList var4 = Lists.newArrayList();
      var1.put(var2, var4);
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
