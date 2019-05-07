import { IResult } from './result-lottery.model';
export class Result implements IResult {
    constructor(
        public id?: number,
        public first?: string,
        public second?: string,
        public third?: string,
        public fourth?: string,
        public fifth?: string,
        public sixth?: string,
        public seventh?: string,
        public special?: string,
        public create_date?: string,
        public regional?: number
    ) {}
}
