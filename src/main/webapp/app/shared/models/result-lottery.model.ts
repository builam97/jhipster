export interface IResult {
    id?: number;
    first?: string;
    second?: string;
    third?: string;
    fourth?: string;
    fifth?: string;
    sixth?: string;
    seventh?: string;
    special?: string;
    create_date?: string;
    regional?: number;
}
export class Result implements IResult {
    constructor(
        id?: number,
        first?: string,
        second?: string,
        third?: string,
        fourth?: string,
        fifth?: string,
        sixth?: string,
        seventh?: string,
        special?: string,
        create_date?: string,
        regional?: number
    ) {}
}
