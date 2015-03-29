package simplenlg.framework

import scala.collection.JavaConverters._

case class NLGElementRepr(category: ElementCategory, features: Features, parent: NLGElement)(implicit val factory: NLGFactory)

class Features {
  private val repr = collection.mutable.Map[String,AnyRef]()

  def asJava = repr.asJava

  def apply(key: String) = repr(key)

  def update(key: String, value: AnyRef) = repr(key) = value

  def remove(key: String) = repr.remove(key)

  def containsKey(key: String) = repr.contains(key)

  def clear() = repr.clear()

  def keySet() = repr.keySet.asJava
}