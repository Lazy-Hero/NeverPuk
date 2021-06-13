package net.yz;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.yz.m_;
import net.z.wd;
import org.apache.commons.lang3.StringUtils;

public abstract class a8 {
   protected final wd K;
   protected final boolean g;
   protected boolean D;
   protected boolean W;
   protected int Z;
   protected List A = Lists.newArrayList();

   public a8(wd var1, boolean var2) {
      this.K = var1;
      this.g = var2;
   }

   public void g() {
      label0: {
         int var1 = m_.J();
         if(this.D) {
            this.K.a(0);
            this.K.a(this.K.C(-1, this.K.A(), false) - this.K.A());
            if(this.Z < this.A.size()) {
               break label0;
            }

            this.Z = 0;
         }

         int var2 = this.K.C(-1, this.K.A(), false);
         this.A.clear();
         this.Z = 0;
         String var3 = this.K.u().substring(0, this.K.A());
         this.H(var3);
         if(this.A.isEmpty()) {
            return;
         }

         this.D = true;
         this.K.a(var2 - this.K.A());
      }

      this.K.Z((String)this.A.get(this.Z++));
   }

   private void H(String var1) {
      if(var1.length() >= 1) {
         net.nn.j.b().sf.x3.L((net.n2.k)(new net.m.d(var1, this.D(), this.g)));
         this.W = true;
      }

   }

   @Nullable
   public abstract net.u.j D();

   public void U(String... var1) {
      if(this.W) {
         this.D = false;
         this.A.clear();

         for(String var5 : var1) {
            if(!var5.isEmpty()) {
               this.A.add(var5);
            }
         }

         String var6 = this.K.u().substring(this.K.C(-1, this.K.A(), false));
         String var7 = StringUtils.getCommonPrefix(var1);
         if(!var7.isEmpty() && !var6.equalsIgnoreCase(var7)) {
            this.K.a(0);
            this.K.a(this.K.C(-1, this.K.A(), false) - this.K.A());
            this.K.Z(var7);
         } else if(!this.A.isEmpty()) {
            this.D = true;
            this.g();
         }
      }

   }

   public void O() {
      this.D = false;
   }

   public void Y() {
      this.W = false;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
