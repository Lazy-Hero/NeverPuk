package net.c9;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.c9.b;
import net.c9.p;
import net.c9.p1;
import net.c9.pp;
import net.c9.q;
import net.c9.v;
import net.c9.x;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h implements p1 {
   private static final Logger K = LogManager.getLogger();
   private static final Joiner y = Joiner.on(", ");
   private final Map M = Maps.newHashMap();
   private final List g = Lists.newArrayList();
   private final Set z = Sets.newLinkedHashSet();
   private final net.y3.c C;

   public h(net.y3.c var1) {
      this.C = var1;
   }

   public void j(x var1) {
      b.K();
      Iterator var3 = var1.k().iterator();
      if(var3.hasNext()) {
         String var4 = (String)var3.next();
         this.z.add(var4);
         pp var5 = (pp)this.M.get(var4);
         if(var5 == null) {
            var5 = new pp(this.C);
            this.M.put(var4, var5);
         }

         var5.y(var1);
      }

   }

   public Set o() {
      return this.z;
   }

   public q A(m_ var1) throws IOException {
      p var2 = (p)this.M.get(var1.A());
      return var2.A(var1);
   }

   public List R(m_ var1) throws IOException {
      p var2 = (p)this.M.get(var1.A());
      return var2.R(var1);
   }

   private void x() {
      this.M.clear();
      this.z.clear();
   }

   public void y(List var1) {
      this.x();
      b.K();
      K.info("Reloading ResourceManager: {}", y.join(Iterables.transform(var1, new Function() {
         public String S(@Nullable x var1) {
            int[] var2 = b.K();
            return var1 == null?"<NULL>":var1.U();
         }

         private static xn a(xn var0) {
            return var0;
         }
      })));
      Iterator var3 = var1.iterator();
      if(var3.hasNext()) {
         x var4 = (x)var3.next();
         this.j(var4);
      }

      this.D();
   }

   public void y(v var1) {
      this.g.add(var1);
      var1.s(this);
   }

   private void D() {
      for(v var2 : this.g) {
         var2.s(this);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
