package com.section.common.content.entity;

import com.section.common.system.entity.ApprovalDocument;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CT_DOCUMENT_FILE")
public class DocumentFile {

    @Id
    @Column(name = "file_no")
    private Long fileNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doc_no")
    private ApprovalDocument docNo;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "file_name")
    private String fileName;
}