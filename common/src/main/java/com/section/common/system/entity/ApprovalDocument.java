package com.section.common.system.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.section.common.base.entity.type.BaseEntity;
import com.section.common.base.entity.type.YN;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "SY_APPROVAL_DOCUMENT")
public class ApprovalDocument extends BaseEntity {

    @Id
    @Column(name = "DOC_NO")
    private Long docNo;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT_TYPE_CODE")
    private String contentTypeCode;

    @Column(name = "RENEW_YN")
    @Enumerated(EnumType.STRING)
    private YN renewYn;

    @Column(name = "RENEW_CNT")
    private Long renewCnt;

    @Column(name = "DEL_YN")
    @Enumerated(EnumType.STRING)
    private YN delYn;
}
