package net.no;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.no.s8;

public class ip implements net.n2.k {
   private ip.a V;
   private List t;
   private List d;
   private boolean u;
   private boolean Q;

   public ip() {
   }

   public ip(ip.a var1, List var2, List var3, boolean var4, boolean var5) {
      this.V = var1;
      this.t = var2;
      this.d = var3;
      this.u = var4;
      this.Q = var5;
   }

   public void m(net.x.t var1) {
      var1.F(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.V = (ip.a)var1.S(ip.a.class);
      this.u = var1.readBoolean();
      this.Q = var1.readBoolean();
      int var2 = var1.q();
      this.t = Lists.newArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.t.add(net.cr.n.E(var1.q()));
      }

      if(this.V == ip.a.INIT) {
         var2 = var1.q();
         this.d = Lists.newArrayList();

         for(int var5 = 0; var5 < var2; ++var5) {
            this.d.add(net.cr.n.E(var1.q()));
         }
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.A(this.V);
      s8.x();
      var1.writeBoolean(this.u);
      var1.writeBoolean(this.Q);
      var1.a(this.t.size());
      Iterator var3 = this.t.iterator();
      if(var3.hasNext()) {
         net.cr.s var4 = (net.cr.s)var3.next();
         var1.a(net.cr.n.x(var4));
      }

      if(this.V == ip.a.INIT) {
         var1.a(this.d.size());
         var3 = this.d.iterator();
         if(var3.hasNext()) {
            net.cr.s var6 = (net.cr.s)var3.next();
            var1.a(net.cr.n.x(var6));
         }
      }

   }

   public List W() {
      return this.t;
   }

   public List V() {
      return this.d;
   }

   public boolean x() {
      return this.u;
   }

   public boolean N() {
      return this.Q;
   }

   public ip.a I() {
      return this.V;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum a {
      INIT,
      ADD,
      REMOVE;
   }
}
