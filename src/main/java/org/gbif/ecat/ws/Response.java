/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.gbif.ecat.ws;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Response\",\"namespace\":\"org.gbif.ecat.ws\",\"fields\":[{\"name\":\"kingdomId\",\"type\":[\"int\",\"null\"]},{\"name\":\"phylumId\",\"type\":[\"int\",\"null\"]},{\"name\":\"classId\",\"type\":[\"int\",\"null\"]},{\"name\":\"orderId\",\"type\":[\"int\",\"null\"]},{\"name\":\"familyId\",\"type\":[\"int\",\"null\"]},{\"name\":\"genusId\",\"type\":[\"int\",\"null\"]},{\"name\":\"nameId\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer kingdomId;
  @Deprecated public java.lang.Integer phylumId;
  @Deprecated public java.lang.Integer classId;
  @Deprecated public java.lang.Integer orderId;
  @Deprecated public java.lang.Integer familyId;
  @Deprecated public java.lang.Integer genusId;
  @Deprecated public java.lang.Integer nameId;

  /**
   * Default constructor.
   */
  public Response() {}

  /**
   * All-args constructor.
   */
  public Response(java.lang.Integer kingdomId, java.lang.Integer phylumId, java.lang.Integer classId, java.lang.Integer orderId, java.lang.Integer familyId, java.lang.Integer genusId, java.lang.Integer nameId) {
    this.kingdomId = kingdomId;
    this.phylumId = phylumId;
    this.classId = classId;
    this.orderId = orderId;
    this.familyId = familyId;
    this.genusId = genusId;
    this.nameId = nameId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return kingdomId;
    case 1: return phylumId;
    case 2: return classId;
    case 3: return orderId;
    case 4: return familyId;
    case 5: return genusId;
    case 6: return nameId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: kingdomId = (java.lang.Integer)value$; break;
    case 1: phylumId = (java.lang.Integer)value$; break;
    case 2: classId = (java.lang.Integer)value$; break;
    case 3: orderId = (java.lang.Integer)value$; break;
    case 4: familyId = (java.lang.Integer)value$; break;
    case 5: genusId = (java.lang.Integer)value$; break;
    case 6: nameId = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'kingdomId' field.
   */
  public java.lang.Integer getKingdomId() {
    return kingdomId;
  }

  /**
   * Sets the value of the 'kingdomId' field.
   * @param value the value to set.
   */
  public void setKingdomId(java.lang.Integer value) {
    this.kingdomId = value;
  }

  /**
   * Gets the value of the 'phylumId' field.
   */
  public java.lang.Integer getPhylumId() {
    return phylumId;
  }

  /**
   * Sets the value of the 'phylumId' field.
   * @param value the value to set.
   */
  public void setPhylumId(java.lang.Integer value) {
    this.phylumId = value;
  }

  /**
   * Gets the value of the 'classId' field.
   */
  public java.lang.Integer getClassId() {
    return classId;
  }

  /**
   * Sets the value of the 'classId' field.
   * @param value the value to set.
   */
  public void setClassId(java.lang.Integer value) {
    this.classId = value;
  }

  /**
   * Gets the value of the 'orderId' field.
   */
  public java.lang.Integer getOrderId() {
    return orderId;
  }

  /**
   * Sets the value of the 'orderId' field.
   * @param value the value to set.
   */
  public void setOrderId(java.lang.Integer value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'familyId' field.
   */
  public java.lang.Integer getFamilyId() {
    return familyId;
  }

  /**
   * Sets the value of the 'familyId' field.
   * @param value the value to set.
   */
  public void setFamilyId(java.lang.Integer value) {
    this.familyId = value;
  }

  /**
   * Gets the value of the 'genusId' field.
   */
  public java.lang.Integer getGenusId() {
    return genusId;
  }

  /**
   * Sets the value of the 'genusId' field.
   * @param value the value to set.
   */
  public void setGenusId(java.lang.Integer value) {
    this.genusId = value;
  }

  /**
   * Gets the value of the 'nameId' field.
   */
  public java.lang.Integer getNameId() {
    return nameId;
  }

  /**
   * Sets the value of the 'nameId' field.
   * @param value the value to set.
   */
  public void setNameId(java.lang.Integer value) {
    this.nameId = value;
  }

  /** Creates a new Response RecordBuilder */
  public static org.gbif.ecat.ws.Response.Builder newBuilder() {
    return new org.gbif.ecat.ws.Response.Builder();
  }
  
  /** Creates a new Response RecordBuilder by copying an existing Builder */
  public static org.gbif.ecat.ws.Response.Builder newBuilder(org.gbif.ecat.ws.Response.Builder other) {
    return new org.gbif.ecat.ws.Response.Builder(other);
  }
  
  /** Creates a new Response RecordBuilder by copying an existing Response instance */
  public static org.gbif.ecat.ws.Response.Builder newBuilder(org.gbif.ecat.ws.Response other) {
    return new org.gbif.ecat.ws.Response.Builder(other);
  }
  
  /**
   * RecordBuilder for Response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Response>
    implements org.apache.avro.data.RecordBuilder<Response> {

    private java.lang.Integer kingdomId;
    private java.lang.Integer phylumId;
    private java.lang.Integer classId;
    private java.lang.Integer orderId;
    private java.lang.Integer familyId;
    private java.lang.Integer genusId;
    private java.lang.Integer nameId;

    /** Creates a new Builder */
    private Builder() {
      super(org.gbif.ecat.ws.Response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.gbif.ecat.ws.Response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Response instance */
    private Builder(org.gbif.ecat.ws.Response other) {
            super(org.gbif.ecat.ws.Response.SCHEMA$);
      if (isValidValue(fields()[0], other.kingdomId)) {
        this.kingdomId = data().deepCopy(fields()[0].schema(), other.kingdomId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.phylumId)) {
        this.phylumId = data().deepCopy(fields()[1].schema(), other.phylumId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.classId)) {
        this.classId = data().deepCopy(fields()[2].schema(), other.classId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orderId)) {
        this.orderId = data().deepCopy(fields()[3].schema(), other.orderId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.familyId)) {
        this.familyId = data().deepCopy(fields()[4].schema(), other.familyId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.genusId)) {
        this.genusId = data().deepCopy(fields()[5].schema(), other.genusId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.nameId)) {
        this.nameId = data().deepCopy(fields()[6].schema(), other.nameId);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'kingdomId' field */
    public java.lang.Integer getKingdomId() {
      return kingdomId;
    }
    
    /** Sets the value of the 'kingdomId' field */
    public org.gbif.ecat.ws.Response.Builder setKingdomId(java.lang.Integer value) {
      validate(fields()[0], value);
      this.kingdomId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'kingdomId' field has been set */
    public boolean hasKingdomId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'kingdomId' field */
    public org.gbif.ecat.ws.Response.Builder clearKingdomId() {
      kingdomId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'phylumId' field */
    public java.lang.Integer getPhylumId() {
      return phylumId;
    }
    
    /** Sets the value of the 'phylumId' field */
    public org.gbif.ecat.ws.Response.Builder setPhylumId(java.lang.Integer value) {
      validate(fields()[1], value);
      this.phylumId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'phylumId' field has been set */
    public boolean hasPhylumId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'phylumId' field */
    public org.gbif.ecat.ws.Response.Builder clearPhylumId() {
      phylumId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'classId' field */
    public java.lang.Integer getClassId() {
      return classId;
    }
    
    /** Sets the value of the 'classId' field */
    public org.gbif.ecat.ws.Response.Builder setClassId(java.lang.Integer value) {
      validate(fields()[2], value);
      this.classId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'classId' field has been set */
    public boolean hasClassId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'classId' field */
    public org.gbif.ecat.ws.Response.Builder clearClassId() {
      classId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'orderId' field */
    public java.lang.Integer getOrderId() {
      return orderId;
    }
    
    /** Sets the value of the 'orderId' field */
    public org.gbif.ecat.ws.Response.Builder setOrderId(java.lang.Integer value) {
      validate(fields()[3], value);
      this.orderId = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'orderId' field has been set */
    public boolean hasOrderId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'orderId' field */
    public org.gbif.ecat.ws.Response.Builder clearOrderId() {
      orderId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'familyId' field */
    public java.lang.Integer getFamilyId() {
      return familyId;
    }
    
    /** Sets the value of the 'familyId' field */
    public org.gbif.ecat.ws.Response.Builder setFamilyId(java.lang.Integer value) {
      validate(fields()[4], value);
      this.familyId = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'familyId' field has been set */
    public boolean hasFamilyId() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'familyId' field */
    public org.gbif.ecat.ws.Response.Builder clearFamilyId() {
      familyId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'genusId' field */
    public java.lang.Integer getGenusId() {
      return genusId;
    }
    
    /** Sets the value of the 'genusId' field */
    public org.gbif.ecat.ws.Response.Builder setGenusId(java.lang.Integer value) {
      validate(fields()[5], value);
      this.genusId = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'genusId' field has been set */
    public boolean hasGenusId() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'genusId' field */
    public org.gbif.ecat.ws.Response.Builder clearGenusId() {
      genusId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'nameId' field */
    public java.lang.Integer getNameId() {
      return nameId;
    }
    
    /** Sets the value of the 'nameId' field */
    public org.gbif.ecat.ws.Response.Builder setNameId(java.lang.Integer value) {
      validate(fields()[6], value);
      this.nameId = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'nameId' field has been set */
    public boolean hasNameId() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'nameId' field */
    public org.gbif.ecat.ws.Response.Builder clearNameId() {
      nameId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Response build() {
      try {
        Response record = new Response();
        record.kingdomId = fieldSetFlags()[0] ? this.kingdomId : (java.lang.Integer) defaultValue(fields()[0]);
        record.phylumId = fieldSetFlags()[1] ? this.phylumId : (java.lang.Integer) defaultValue(fields()[1]);
        record.classId = fieldSetFlags()[2] ? this.classId : (java.lang.Integer) defaultValue(fields()[2]);
        record.orderId = fieldSetFlags()[3] ? this.orderId : (java.lang.Integer) defaultValue(fields()[3]);
        record.familyId = fieldSetFlags()[4] ? this.familyId : (java.lang.Integer) defaultValue(fields()[4]);
        record.genusId = fieldSetFlags()[5] ? this.genusId : (java.lang.Integer) defaultValue(fields()[5]);
        record.nameId = fieldSetFlags()[6] ? this.nameId : (java.lang.Integer) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}