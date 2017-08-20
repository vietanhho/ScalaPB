// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.trueaccord.scalapb.scalapb



/** @param extends
  *   Additional classes and traits to mix in to the case class.
  * @param companionExtends
  *   Additional classes and traits to mix in to the companion object.
  */
@SerialVersionUID(0L)
final case class MessageOptions(
    `extends`: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty,
    companionExtends: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty,
    annotations: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MessageOptions] with com.trueaccord.lenses.Updatable[MessageOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      `extends`.foreach(`extends` => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, `extends`))
      companionExtends.foreach(companionExtends => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, companionExtends))
      annotations.foreach(annotations => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, annotations))
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      `extends`.foreach { __v =>
        _output__.writeString(1, __v)
      };
      companionExtends.foreach { __v =>
        _output__.writeString(2, __v)
      };
      annotations.foreach { __v =>
        _output__.writeString(3, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.trueaccord.scalapb.scalapb.MessageOptions = {
      val __extends = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.`extends`)
      val __companionExtends = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.companionExtends)
      val __annotations = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.annotations)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __extends += _input__.readString()
          case 18 =>
            __companionExtends += _input__.readString()
          case 26 =>
            __annotations += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.trueaccord.scalapb.scalapb.MessageOptions(
          `extends` = __extends.result(),
          companionExtends = __companionExtends.result(),
          annotations = __annotations.result()
      )
    }
    def clearExtends = copy(`extends` = _root_.scala.collection.Seq.empty)
    def addExtends(__vs: String*): MessageOptions = addAllExtends(__vs)
    def addAllExtends(__vs: TraversableOnce[String]): MessageOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.collection.Seq[String]): MessageOptions = copy(`extends` = __v)
    def clearCompanionExtends = copy(companionExtends = _root_.scala.collection.Seq.empty)
    def addCompanionExtends(__vs: String*): MessageOptions = addAllCompanionExtends(__vs)
    def addAllCompanionExtends(__vs: TraversableOnce[String]): MessageOptions = copy(companionExtends = companionExtends ++ __vs)
    def withCompanionExtends(__v: _root_.scala.collection.Seq[String]): MessageOptions = copy(companionExtends = __v)
    def clearAnnotations = copy(annotations = _root_.scala.collection.Seq.empty)
    def addAnnotations(__vs: String*): MessageOptions = addAllAnnotations(__vs)
    def addAllAnnotations(__vs: TraversableOnce[String]): MessageOptions = copy(annotations = annotations ++ __vs)
    def withAnnotations(__v: _root_.scala.collection.Seq[String]): MessageOptions = copy(annotations = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
        case 2 => companionExtends
        case 3 => annotations
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PRepeated(companionExtends.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PRepeated(annotations.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.trueaccord.scalapb.scalapb.MessageOptions
}

object MessageOptions extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.trueaccord.scalapb.scalapb.MessageOptions] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.trueaccord.scalapb.scalapb.MessageOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.trueaccord.scalapb.scalapb.MessageOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.trueaccord.scalapb.scalapb.MessageOptions(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[String]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.trueaccord.scalapb.scalapb.MessageOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.trueaccord.scalapb.scalapb.MessageOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.trueaccord.scalapb.scalapb.MessageOptions(
  )
  implicit class MessageOptionsLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.trueaccord.scalapb.scalapb.MessageOptions]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.trueaccord.scalapb.scalapb.MessageOptions](_l) {
    def `extends`: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
    def companionExtends: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.companionExtends)((c_, f_) => c_.copy(companionExtends = f_))
    def annotations: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.annotations)((c_, f_) => c_.copy(annotations = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
  final val COMPANION_EXTENDS_FIELD_NUMBER = 2
  final val ANNOTATIONS_FIELD_NUMBER = 3
}
