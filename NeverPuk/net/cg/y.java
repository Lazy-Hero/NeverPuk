package net.cg;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.cg.d;
import net.cg.h;
import net.nj.f;

public class y {
   private final d k;
   protected Map A = Maps.newHashMap();
   private final List r = Lists.newArrayList();
   private final Map t = Maps.newHashMap();

   public y(d var1) {
      this.k = var1;
      this.m();
   }

   @Nullable
   public h a(Class var1, String var2) {
      h var3 = (h)this.A.get(var2);
      return var3;
   }

   public void z(String var1, h var2) {
      if(this.A.containsKey(var1)) {
         this.r.remove(this.A.remove(var1));
      }

      this.A.put(var1, var2);
      this.r.add(var2);
   }

   public void x() {
      for(int var1 = 0; var1 < this.r.size(); ++var1) {
         h var2 = (h)this.r.get(var1);
         if(var2.Q()) {
            this.M(var2);
            var2.D(false);
         }
      }

   }

   private void M(h var1) {
      if(this.k != null) {
         File var2 = this.k.q(var1.D);
         f var3 = new f();
         var3.K("data", var1.v(new f()));
         FileOutputStream var4 = new FileOutputStream(var2);
         net.nj.x.z(var3, var4);
         var4.close();
      }

   }

   private void m() {
      this.t.clear();
      if(this.k != null) {
         File var1 = this.k.q("idcounts");
         if(var1.exists()) {
            DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
            f var3 = net.nj.x.f(var2);
            var2.close();

            for(String var5 : var3.b()) {
               net.nj.q var6 = var3.m(var5);
               if(var6 instanceof net.nj.r) {
                  net.nj.r var7 = (net.nj.r)var6;
                  short var8 = var7.z();
                  this.t.put(var5, Short.valueOf(var8));
               }
            }
         }

      }
   }

   public int n(String var1) {
      net.cg.z.V();
      Short var3 = (Short)this.t.get(var1);
      if(var3 == null) {
         var3 = Short.valueOf((short)0);
      }

      var3 = Short.valueOf((short)(var3.shortValue() + 1));
      this.t.put(var1, var3);
      if(this.k == null) {
         return var3.shortValue();
      } else {
         File var4 = this.k.q("idcounts");
         f var5 = new f();
         Iterator var6 = this.t.keySet().iterator();
         if(var6.hasNext()) {
            String var7 = (String)var6.next();
            var5.h(var7, ((Short)this.t.get(var7)).shortValue());
         }

         DataOutputStream var9 = new DataOutputStream(new FileOutputStream(var4));
         net.nj.x.T(var5, (DataOutput)var9);
         var9.close();
         return var3.shortValue();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
