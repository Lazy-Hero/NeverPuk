package net.c;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.c.w;
import net.yz.a0;
import net.yz.t;

public class d extends w implements a0 {
   protected final t X = new t(256);
   protected final Map U;

   public d() {
      this.U = ((BiMap)this.y).inverse();
   }

   public void D(int var1, Object var2, Object var3) {
      this.X.E(var3, var1);
      this.H(var2, var3);
   }

   protected Map b() {
      return HashBiMap.create();
   }

   @Nullable
   public Object B(@Nullable Object var1) {
      return super.B(var1);
   }

   @Nullable
   public Object t(Object var1) {
      return this.U.get(var1);
   }

   public boolean l(Object var1) {
      return super.l(var1);
   }

   public int D(@Nullable Object var1) {
      return this.X.w(var1);
   }

   @Nullable
   public Object T(int var1) {
      return this.X.d(var1);
   }

   public Iterator iterator() {
      return this.X.iterator();
   }
}
