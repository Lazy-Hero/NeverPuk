package net;

import java.util.ArrayList;
import java.util.List;
import net._x;
import net.ol;
import net.u8;
import net.u9;
import net.uc;
import net.uh;
import net.un;
import net.ut;
import net.xn;
import net.u.d;

public class dt {
   private final ArrayList p = new ArrayList();

   public dt() {
      _x.K(new ol(this));
      this.p.add(new uc());
      this.p.add(new uh());
      this.p.add(new u8());
      this.p.add(new ut());
      this.p.add(new u9());
   }

   public List A() {
      return this.p;
   }

   public boolean o(String var1) {
      un.R();
      String var3 = var1.substring(1);
      String[] var4 = var3.split(" ");
      if(var4.length > 0) {
         ArrayList var5 = this.p;
         int var6 = 0;
         int var7 = var5.size();
         if(var6 < var7) {
            un var8 = (un)var5.get(var6);
            String[] var9 = var8.A();
            int var11 = var9.length;
            int var12 = 0;
            if(var12 < var11) {
               String var13 = var9[var12];
               if(var4[0].equalsIgnoreCase(var13)) {
                  var8.o(var4);
                  return true;
               }

               ++var12;
            }

            ++var6;
         }
      }

      if(d.y() == null) {
         un.T("C5XDab");
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
