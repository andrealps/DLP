package ast;

import visitor.Visitor;

import java.util.List;

public class Record extends AbstractType {
    private List<RecordField> recordFields;

    public Record(int line, int column, List<RecordField> recordFields) {
        super(line, column);
        this.recordFields = recordFields;
    }

    public List<RecordField> getRecordFields() {
        return recordFields;
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public Type dot(String fieldName) {
        for (RecordField field : recordFields)
            if (field.getName().equals(fieldName))
                return field.getType();
        return null;
    }

    @Override
    public int numberOfBytes() {
        return recordFields.stream().map(recordField -> recordField.getType().numberOfBytes()).reduce((total, size) -> total + size).get();
    }

    @Override
    public int getOffsetByField(String name) {
        for (int i = 0; i < recordFields.size(); i++)
            if (recordFields.get(i).getName().equals(name))
                return i;
        return -1;
    }
}