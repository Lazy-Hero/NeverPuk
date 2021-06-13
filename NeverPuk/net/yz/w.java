package net.yz;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.xn;
import net.yz.m_;
import org.apache.commons.lang3.Validate;

public class w extends AbstractList {
   private final List b;
   private final Object q;

   public static w T() {
      return new w();
   }

   public static w C(int var0, Object var1) {
      Validate.notNull(var1);
      Object[] var2 = new Object[var0];
      Arrays.fill(var2, var1);
      return new w(Arrays.asList((Object[])var2), var1);
   }

   public static w v(Object var0, Object... var1) {
      return new w(Arrays.asList(var1), var0);
   }

   protected w() {
      this(new ArrayList(), (Object)null);
   }

   protected w(List var1, @Nullable Object var2) {
      this.b = var1;
      this.q = var2;
   }

   @Nonnull
   public Object get(int var1) {
      return this.b.get(var1);
   }

   public Object set(int var1, Object var2) {
      Validate.notNull(var2);
      return this.b.set(var1, var2);
   }

   public void add(int var1, Object var2) {
      Validate.notNull(var2);
      this.b.add(var1, var2);
   }

   public Object remove(int var1) {
      return this.b.remove(var1);
   }

   public int size() {
      return this.b.size();
   }

   public void clear() {
      int var1 = m_.J();
      if(this.q == null) {
         super.clear();
      }

      int var2 = 0;
      if(var2 < this.size()) {
         this.set(var2, this.q);
         ++var2;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
